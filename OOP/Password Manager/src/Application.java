import java.sql.SQLOutput;
import java.util.*;

public class Application {
    private static ArrayList<AuthenticationInfo> loginrecords;
    private Scanner scanner;

    public Application() {
        loginrecords = new ArrayList<>();
        scanner = new Scanner(System.in);
    }

    public void start() {
        int choice;

            do {

                System.out.println("Menu:");
                System.out.println("1. New login Info:");
                System.out.println("2. View login Info:");
                System.out.println("3. Exit");
                System.out.println("Enter your choice:");
                choice = scanner.nextInt();
                scanner.nextLine();

                switch (choice) {
                    case 1:
                        System.out.println("Enter url:");
                        String url = scanner.nextLine();
                        System.out.println("Enter username:");
                        String name = scanner.nextLine();
                        System.out.println("Enter password");
                        String password = scanner.nextLine();
                        AuthenticationInfo au = createLoginRecord(new AuthenticationInfo(url, name, password));
                        loginrecords.add(au);
                        System.out.println("Login Info created successfully");
                        break;
                    case 2:
                        System.out.println("Enter URL:");
                        String checkurl = scanner.nextLine();
                        AuthenticationInfo as = viewLoginInfo(checkurl);
                        if(as == null) {
                            System.out.println("Nothing found");
                        } else {
                            System.out.println("URL: " + as.getWebsite_URL());
                            System.out.println("Username: " + as.getUsername());
                            System.out.println("Password: " + as.getPassword());
                        }

                        break;
                    case 3:
                        System.out.println("Exiting...");
                        break;
                    default:
                        System.out.println("Invalid option. Please try again");

                }

            } while(choice!=3);


    }

    private static AuthenticationInfo createLoginRecord(AuthenticationInfo authenticationInfo) {
        String temp = EncrytionUtil.encrypt(authenticationInfo.getPassword());
        authenticationInfo.setPassword(temp);
        return authenticationInfo;
    }

    private static AuthenticationInfo viewLoginInfo(String checkurl) {
        AuthenticationInfo showinfo = null;
        for(AuthenticationInfo au: loginrecords) {
            if(au.getWebsite_URL().equals(checkurl)) {
                showinfo = new AuthenticationInfo(au.getWebsite_URL(), au.getUsername(), EncrytionUtil.decrypt(au.getPassword()));
                break;
            }
        }

        return showinfo;
    }


}
