package com.mycompany.study.ch06;

public class BoardExample {
    public static void main(String[] args) {
         
        Board board = new Board();

        board.say();

        //System.out.print(board.name + " ");
        //System.out.print(board.view + " ");
        //System.out.println(board.useYN);        

        Board board2 = new Board("김무겸", 15, true);
        board2.say();

    }
    
}
