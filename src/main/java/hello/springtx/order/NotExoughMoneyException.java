package hello.springtx.order;

public class NotExoughMoneyException extends Exception{
    public NotExoughMoneyException(String message) {
        super(message);
    }
}
