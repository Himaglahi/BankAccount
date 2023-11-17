
package bankaccount;
public class Main {
    
    public static void main(String[] args) {

        Bankaccount j = new Bankaccount();
        j.setName("mj magsalos");
        j.setAge(19);
        j.setAccNum(123456);
        j.setBalance(1.5, 2);

        System.out.println("CHINA BANK!" + "\n" + "Name:" + j.getName() + "\n" + "Age:" + j.getAge() + "\n" + "Account Number:" + j.getaccNum() + "\n" + "Balance:" + j.getBalance());

    }
    
    
    
}
