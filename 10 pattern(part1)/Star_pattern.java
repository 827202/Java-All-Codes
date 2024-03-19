 public class Star_pattern {
    public static void main(String[] args) {
        for(int line=1;line<=4;line++){
            for(int star=1;star<=line;star++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        for(int line=1;line<=4;line++){
            for(int star=1;star<=4-line+1;star++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int line=1;line<=4;line++){
            for(int star=1;star<=line;star++){
                System.out.print(star);
            }
            System.out.println();
        }
        for(int line=1;line<=4;line++){
            for(int star=1;star<=line;star++){
                System.out.print(line);
            }
            System.out.println();
        }
        char ch='A';
        for(int line=1;line<=4;line++){
            for(int chars=1;chars<=line;chars++){
                 System.out.print(ch);
                 ch++;
               
            }
            System.out.println();
            
        }
        for(int line=1;line<=5;line++){
            for(int star=1;star<=5-line+1;star++){
                System.out.print(star);
            }
            System.out.println();
        }
        int a=1;
        for(int line=1;line<=5;line++){
            for(int star=1;star<=line;star++){
                System.out.print(a+ " ");
                a++;
                
            }
            System.out.println();
        }

        
    }
}

       