public class MajorityOfElements {

    public static int MajorityCheck(int arr[], int n) {
        int Maxcount = 0;
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j])
                    count = count + 1;

            }
            if (count > Maxcount) {
                Maxcount = count;
                index = i;
            }

        }
        if (Maxcount > n / 2) {
            return arr[index];

        }

        return -1;
    }

    public static void main(String args[]) {

        int arr[] = { 2, 4, 5, 5, 5, 5, 5 };
        int n = arr.length;
        System.out.println(MajorityCheck(arr, n));
    }
}