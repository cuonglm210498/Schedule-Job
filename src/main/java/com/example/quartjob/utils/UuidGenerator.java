package com.example.quartjob.utils;

import java.util.UUID;

/**
 * @author CuongLM18
 * @created 14/09/2022 - 4:25 PM
 * @project quart-job
 */
public class UuidGenerator {

    public static String generateUuid() {
        UUID uuid = UUID.randomUUID();
        return uuid.toString();
    }
}
