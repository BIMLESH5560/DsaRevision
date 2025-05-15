package ARRAYQUESTION;

import java.util.HashMap;
import java.util.Map;

public class MaXfreqElementInArray {
	public static int MostFrequencyElement(int arr[]) {
		Map<Integer,Integer> freqMap=new HashMap<>();
		int ans=-1; int maxFreq=0;
		for(int i=0; i<arr.length; i++) {
			freqMap.put(arr[i] ,freqMap.getOrDefault( arr[i], 0)+1);
		    if(freqMap.get( arr[i])>maxFreq) {
				maxFreq=freqMap.get(arr[i]);
				ans=arr[i];
			}
		}
		
		for(Integer ele:freqMap.keySet()) {
			System.out.println(ele + ":" + freqMap.get(ele));
		}
		return ans;

	}
	public static void main(String[] args) {
		int arr[]= {1,2,3,1,5,6,2,2,7,8,3,1};
		int ans= MostFrequencyElement(arr);
		System.out.println(ans);
	}

}
