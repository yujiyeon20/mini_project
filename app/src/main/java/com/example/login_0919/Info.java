package com.example.login_0919;

public class Info {
    String number;    // 글번호
    String content;    // 내용

    public Info(String number, String content) {
        this.number = number;
        this.content = content;
    }

    public String getNumber() {
        return number;
    }

    public String getContent() {
        return content;
    }
}
