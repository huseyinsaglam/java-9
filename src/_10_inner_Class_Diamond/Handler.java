package _10_inner_Class_Diamond;

public abstract class Handler<T>{

    public T content;

    public Handler(T content) {
        this.content = content;
    }

    T getNotes(T message){
        return message;
    }

    public abstract void getMessage();
}
