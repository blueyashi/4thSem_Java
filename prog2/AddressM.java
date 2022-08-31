import java.util.Scanner;
public class AddressM {
    public static void main(String args[]){
        int n, i;
        String usn, name, empid;
        System.out.println("Enter the number of Objects");
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        in.nextLine();

        Address addr[] = new Address[10];
        Student stud[] = new Student[10];
        College col[] = new College[10];
        Employee empl[] = new Employee[10];

        for(i=0; i<n; i++){
            System.out.println("Enter the Details of Student: " + (i+1));
            System.out.println("Name:");
            name = in.nextLine();
            System.out.println("USN:");
            usn = in.nextLine();
            System.out.println("Enter the addr of " + name);
            System.out.println("1. Street Number\n2. City\n3. State\n4. Country");
            addr[i] = new Address(Integer.parseInt(in.nextLine()), in.nextLine(), in.nextLine(), in.nextLine());
            stud[i] = new Student(name,usn, addr[i]);
        }

        for(i=0; i<n; i++){
            System.out.println("Enter the Details of Employee: " + (i+1));
            System.out.println("Name : ");
            name = in.nextLine();
            System.out.println("Employee empid :");
            empid = in.nextLine();
            System.out.println("Enter the addr of " + name);
            System.out.println("1. Street Number\n2. City\n3. State\n4. Country");
            addr[i] = new Address(Integer.parseInt(in.nextLine()), in.nextLine(), in.nextLine(), in.nextLine());
            empl[i] = new Employee(name,empid,addr[i]);
        }


        for(i=0; i<n; i++){
            System.out.println("Enter the Details of College: " + (i+1));
            System.out.println("College Name : ");
            name = in.nextLine();
            System.out.println("Enter the addr of " + name);
            System.out.println("1. Street Number\n2. City\n3. State\n4. Country");
            addr[i] = new Address(Integer.parseInt(in.nextLine()), in.nextLine(), in.nextLine(), in.nextLine());
            col[i] = new College(name, addr[i]);
        }

        while (true){
            System.out.println("1. Student Detail\n2. Employee Detail\n3. College Detail\nEnter your Choice");
            int var;
            var = in.nextInt();
            switch (var){
                case 1:
                    for (i=0; i<n; i++){
                        String format = "|%1$-10s|%2$-10s|%3$-40s|\n";
                        System.out.format(format, "Name", "USN", "Address");
                        System.out.format(format, stud[i].name, stud[i].usn, stud[i].addr.num + ", " + stud[i].addr.city + ", " + stud[i].addr.state + ", " + stud[i].addr.country);
                    }
                    break;
                case 2:
                    for (i=0; i<n; i++){
                        String format = "|%1$-10s|%2$-10s|%3$-40s|\n";
                        System.out.format(format, "Name", "Employee ID", "Address");
                        System.out.format(format, empl[i].name, empl[i].empid, empl[i].addr.num + ", " + empl[i].addr.city + ", " + empl[i].addr.state + ", " + empl[i].addr.country);
                    }
                    break;
                case 3:
                    for (i=0; i<n; i++){
                        String format = "|%1$-15s|%2$-40s|\n";
                        System.out.format(format, "College Name", "Address");
                        System.out.format(format, col[i].name, col[i].addr.num + ", " + col[i].addr.city + ", " + col[i].addr.state + ", " + col[i].addr.country);
                    }
                    break;
                default:
                    break;
            }

        }
    }
}
