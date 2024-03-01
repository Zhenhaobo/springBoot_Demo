package com.example.sprintboot_demo.utils;

import java.util.Random;

public class RandomString {
    private static final String CHINESE_CHARACTERS = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789\u4e00-\u9fff"; // Unicode编码中的中文字符范围

    public static String generateRandomChineseString(int length) {
        StringBuilder sb = new StringBuilder();
        Random random = new Random();

        for (int i = 0; i < length; i++) {
            // 生成随机索引
            int randomIndex = random.nextInt(CHINESE_CHARACTERS.length());
            // 从扩展的中文字符集中选择字符
            char ch = CHINESE_CHARACTERS.charAt(randomIndex);
            sb.append(ch);
        }

        return sb.toString();
    }
}
