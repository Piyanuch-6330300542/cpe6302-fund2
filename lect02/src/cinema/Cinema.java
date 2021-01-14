//นายธนพล ชาวคูเวียง 6330300372
//นางสาวปิยนุช ทองเอียด 6330300542
//นางสาวสมิตา ศรีนาราง 6330300925

import java.util.Scanner;


class Tamjung {
    private Scanner scanner;
    private String botName;
    private int createdYear;

    Tamjung(String botName, int createdYear) {
        this.scanner = new Scanner(System.in);
        this.botName = botName;
        this.createdYear = createdYear;
    }

    void greeting() {
        System.out.println("ฉันชื่อ"+this.botName);
        System.out.println("สร้างขึ้นเมื่อปี"+this.createdYear);
        System.out.println("เธอชื่ออะไร?");
        System.out.print("> ");
        String name = this.scanner.next();
        System.out.print("สวัสดี" + name + "!");
    }

    void guessAge() {
        System.out.println("ฉันจะเดาว่าเธออายุเท่าไหร่");
        System.out.println("ช่วยบอก เศษที่ได้จากการหารอายุของเธอด้วย 3 5 และ7");
        System.out.print("> ");
        Integer rem3 = scanner.nextInt();
        System.out.print("> ");
        Integer rem5 = scanner.nextInt();
        System.out.print("> ");
        Integer rem7 = scanner.nextInt();
        int age = ((rem3 * 70) + (rem5 * 21) + (rem7 * 15)) % 105;
        System.out.println("เธออายุ "+age+": เป็นช่วงอายุที่น่าสนุกมากของชีวิตเลย!");
    }

    void countNumber() {
        System.out.println("ตอนนี้ ฉันจะแสดงให้เธอเห็นว่าฉันนับเลข 1-100ได้นะ");
        System.out.println("เธอต้องการให้ฉันนับถึงเลขไร");
        System.out.print("> ");
        int N = scanner.nextInt();
        int i = 1;
        while(i <= N){
            System.out.println(i+"!");
            i++;
        }

    }

    void quiz() {
       System.out.println("ฉันขอทดสอบความรู้เกี่ยวกับการเขียนโปรแกรมของเธอหน่อยนะ");
       System.out.println("ทำไมเราถึงต้องใช้ method?");
       System.out.println("ก. เพื่อรันคำสั่งซ้ำหลาย ๆ ครั้ง");
       System.out.println("ข. เพื่อแบ่งโปรแกรมออกเป็น subroutine เล็กๆ หลายๆ รูทีน");
       System.out.println("ค. เพื่อวัดเวลาการรันโปรแกรม");
       System.out.println("ง. เพื่ออินเตอร์รัพการทำงานของโปรแกรม");

       String answer;
       System.out.print("> ");
       answer = this.scanner.next();
       while(!answer.equals("ข"))
       {
           System.out.println("ผิด! ลองใหม่อีกครั้งนะ");
           System.out.print("> ");
           answer = this.scanner.nextLine();

       }
       System.out.println("ยินดีด้วย! เธอตอบถูก");
       
    }

    public static void main(String[] args) {
        Tamjung bot = new Tamjung("MiMi", 2021);
        bot.greeting();
        bot.guessAge();
        bot.countNumber();
        bot.quiz();
    }
}
