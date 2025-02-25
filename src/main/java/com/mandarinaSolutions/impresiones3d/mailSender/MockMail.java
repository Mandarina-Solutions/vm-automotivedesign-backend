package com.mandarinaSolutions.impresiones3d.mailSender;

public class MockMail {
    private String from;
    private String to;
    private String body;

    public MockMail(String from, String to, String body) {
        this.from = from;
        this.to = to;
        this.body = body;
    }

    public String getFrom() {
        return from;
    }

    public String getTo() {
        return to;
    }

    public String getBody() {
        return body;
    }

    @Override
    public String toString() {
        return "MockMail{" +
                "from='" + from + '\'' +
                ", to='" + to + '\'' +
                ", body='" + body + '\'' +
                '}';
    }
}
