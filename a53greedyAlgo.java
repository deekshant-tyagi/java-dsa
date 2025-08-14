import java.util.ArrayList;

// Activity selection problem
public class a53greedyAlgo {
    public static void main(String[] args) {
        // start and end times of activities
        int start[] = {1,3,0,5,8,5};
        int end[] = {2,4,6,7,9,9};

        // end time basis sorted
        int maxAct = 0;
        // ArrayList that will store the indices of the activities that can be performed.
        ArrayList<Integer> ans = new ArrayList<>();

        //always consider 1st activity A0 activity
        ans.add(0);
        maxAct = 1;
        int lastEnd = end[0];

        // iterate through all activities
        for (int i = 1; i < end.length; i++) {
            // if start time of this activity is greater than or equal to
            // the end time of previously selected activity, then select it
            if (start[i] >= lastEnd) {
                maxAct++;
                // add the index of this activity to the answer list
                ans.add(i);
                // update the last end time
                lastEnd = end[i];
            }
        }
        System.out.println("Max Activities - "+ maxAct);
        for(int i=0; i<ans.size(); i++){
            System.out.print("A"+ans.get(i)+" ");
        }
    }
}

