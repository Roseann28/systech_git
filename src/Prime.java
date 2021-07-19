public class Prime {
    public static void main(String[] args) {
        int a=2;
        if (a==2){
            System.out.println("This is a prime number");
        }else {
            if (a%2==0){
                System.out.println("This is not a prime number");
            }else{
                if (a%3==0){
                    System.out.println("This is not a prime number");
                }else{
                    if (a%5==0){
                        System.out.println("This is not a prime number");
                    }else {
                        if (a%7==0){
                            System.out.println("This is not a prime number");
                        }else {
                            System.out.println("This is a prime number");
                        }
                    }
                }
            }

        }

    }
}
