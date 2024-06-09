import java.util.Scanner;
public class Quiz1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int operator;
        boolean run = true;
        int a, b;
        while (run) {
            System.out.println("원하는 기능을 선택하세요");
            System.out.println("1. 덧셈 /2. 뺄셈 /3. 곱셈 /4. 나눗셈 /0. 종료");
            operator = sc.nextInt();

            if(operator == 0){
                System.out.println("시스템을 종료합니다.");
                break;
            }else {
                switch (operator) {
                    case 1:
                        System.out.println("첫번째 값을 입력하고 엔터를 누르세요.");
                        a = sc.nextInt();
                        System.out.println("두번째 값을 입력하고 엔터를 누르세요.");
                        b = sc.nextInt();
                        System.out.println(a + " + " + b + " = " + (a + b));
                        break;
                    case 2:
                        System.out.println("첫번째 값을 입력하고 엔터를 누르세요.");
                        a = sc.nextInt();
                        System.out.println("두번째 값을 입력하고 엔터를 누르세요.");
                        b = sc.nextInt();
                        System.out.println(a + " - " + b + " = " + (a - b));
                        break;
                    case 3:
                        System.out.println("첫번째 값을 입력하고 엔터를 누르세요.");
                        a = sc.nextInt();
                        System.out.println("두번째 값을 입력하고 엔터를 누르세요.");
                        b = sc.nextInt();
                        System.out.println(a + " * " + b + " = " + (a * b));
                        break;
                    case 4:
                        System.out.println("첫번째 값을 입력하고 엔터를 누르세요.");
                        a = sc.nextInt();
                        System.out.println("두번째 값을 입력하고 엔터를 누르세요.");
                        b = sc.nextInt();
                        System.out.println(a + " / " + b + " = " + ((double)a / b));
                        break;
                    default:
                        System.out.println("올바른 입력이 아닙니다.");
                        break;
                }
            }
        }
    }
}

