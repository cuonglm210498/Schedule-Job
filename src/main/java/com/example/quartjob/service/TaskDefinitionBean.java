package com.example.quartjob.service;

import com.example.quartjob.modal.TaskDefinition;
import org.springframework.stereotype.Service;

/**
 * @author CuongLM18
 * @created 14/09/2022 - 4:04 PM
 * @project quart-job
 */
@Service
public class TaskDefinitionBean implements Runnable {

    private TaskDefinition taskDefinition;

    @Override
    public void run() {
        System.out.println("Running action: " + taskDefinition.getActionType());
        System.out.println("With Data: " + taskDefinition.getData());
    }

    public TaskDefinition getTaskDefinition() {
        return taskDefinition;
    }

    public void setTaskDefinition(TaskDefinition taskDefinition) {
        this.taskDefinition = taskDefinition;
    }
}
