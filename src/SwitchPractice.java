public class SwitchPractice {

    public static void print(char value){
        switch (Character.toUpperCase(value)){
            case 'A': case 'B':case 'C':case 'D':case 'E':
                System.out.println("An " + value + " was entered");
                break;
            default:
                System.out.println("None were entered");
        }
    }

    public static void main(String[] args) {
        print('B');
    }
}
