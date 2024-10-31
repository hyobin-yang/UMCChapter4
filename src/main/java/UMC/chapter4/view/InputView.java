package UMC.chapter4.view;


import java.util.Scanner;

public class InputView {

    static Scanner scanner = new Scanner(System.in);

    public static String inputTitle(){
        System.out.println("제목을 입력해주세요");
        return scanner.next();
    }

    public static String inputContent(){
        System.out.println("본문을 입력해주세요");
        return scanner.next();
    }


}
