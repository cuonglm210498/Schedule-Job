package com.example.quartjob.controller;

import com.example.quartjob.modal.TaskDefinition;
import com.example.quartjob.service.TaskDefinitionBean;
import com.example.quartjob.service.TaskSchedulingService;
import com.example.quartjob.utils.UuidGenerator;
import lombok.Data;
import org.springframework.web.bind.annotation.*;

/**
 * @author CuongLM18
 * @created 14/09/2022 - 4:22 PM
 * @project quart-job
 */
@Data
@RestController
@RequestMapping("/schedule")
public class JobController {

    private final TaskSchedulingService taskSchedulingService;
    private final TaskDefinitionBean taskDefinitionBean;

    @PostMapping(path="/taskdef", consumes = "application/json", produces="application/json")
    public void scheduleATask(@RequestBody TaskDefinition taskDefinition) {
        taskDefinitionBean.setTaskDefinition(taskDefinition);
        taskSchedulingService.scheduleATask(UuidGenerator.generateUuid(), taskDefinitionBean, taskDefinition.getCronExpression());
    }

    @GetMapping(path="/remove/{jobid}")
    public void removeJob(@PathVariable String jobid) {
        taskSchedulingService.removeScheduledTask(jobid);
    }
}
