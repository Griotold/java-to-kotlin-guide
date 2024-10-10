package com.lannstark.lec07;

import java.io.IOException;

public class Lec07Main {

    public static void main(String[] args) throws IOException {
    }

    private int parseIntOrThrow(String str) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException(String.format("주어진 %s는 숫자가 아닙니다."));
        }
    }

    private Integer parseIntOrThrowV2(String str) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e) {
            return null;
        }
    }
}
