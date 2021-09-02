package model;

public class ChatModel {
    private int id;
    private String message;
    private boolean isMsgr1;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public boolean isMsgr1() {
        return isMsgr1;
    }

    public void setMsgr1(boolean msgr1) {
        isMsgr1 = msgr1;
    }
}
