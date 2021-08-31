package enties;

import java.util.Scanner;
import java.util.regex.Pattern;

public class InputPassword {
    public void passwordValidation(){
        Scanner sn= new Scanner(System.in);
        String password;
        String pattern="^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$.!%*?&])[A-Za-z\\d@$.!%*?&]{10,}$";
        boolean check =false;
        while (!check){
            System.out.println("Nhập vào mật khẩu của bạn:");
            password=sn.nextLine();
            if (password.length()<10){
                System.out.println("Mật khẩu yếu !!");
                check=false;
            }else if (Pattern.matches(pattern,password)){
                System.out.println("Nhập mật khẩu thành công");
            }else {
                System.out.println("Mật khẩu chưa đủ mạnh ");
            }
        }

    }
}
