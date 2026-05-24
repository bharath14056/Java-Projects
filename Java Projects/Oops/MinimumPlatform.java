import java.util.Arrays;

public class MinimumPlatform {
public static void main(String[] args) {
    int arr[] = {900, 940, 950, 1100, 1500, 1800};
  
    int dep[] = {910, 1200, 1120, 1130, 1900, 2000};
  
    Arrays.sort(arr);
    Arrays.sort(dep);
    int i = 0, j = 0;               
    int result = 0, count = 0; int maxcount = 0;         
    while (i < arr.length && j < dep.length) {
        if (arr[i] < dep[j]) {
            count++;
            i++;
        } else {
            count--;
            j++;
        }
        result = Math.max(result, count);
    }
    System.out.println("Minimum Number of Platforms Required = " + result);

        
    
}

}
/* Output:      
PS C:\Users\Bharath.S\Desktop\Java Projects>  c:; cd 'c:\Users\Bharath.S\Desktop\Java Projects'; & 'C:\Program Files\Java\jdk-21\bin\java.exe' '-XX:+ShowCodeDetailsInExceptionMessages' '-cp' 'C:\Users\Bharath.S\AppData\Roaming\Code\User\workspaceStorage\1a1b41490ef2a931f5b6d7abffdaaf5f\redhat.java\jdt_ws\Java Projects_eb40557a\bin' 'MinimumPlatform' 
Minimum Number of Platforms Required = 3 */