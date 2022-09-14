package com.example.quartjob.modal;

import lombok.Data;

/**
 * @author CuongLM18
 * @created 14/09/2022 - 4:00 PM
 * @project quart-job
 */
@Data
public class TaskDefinition {

    private String cronExpression;
    private String actionType;
    private String data;
}
