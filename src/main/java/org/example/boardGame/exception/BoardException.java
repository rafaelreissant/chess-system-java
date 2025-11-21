package org.example.boardGame.exception;

public class BoardException extends RuntimeException{

    private static final long serialVersionUID = 1l;

    public BoardException(String msg) {
        super(msg);
    }
}
