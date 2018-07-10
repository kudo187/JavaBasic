package AssignmentInterface;

public class SelectionSort extends DaySo implements Sort{
	SelectionSort(int n) {
		super(n);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void Sort() {
		// TODO Auto-generated method stub
		for (int i = 0; i < arrDaySo.length - 1; i++)  
        {  
            int index = i;  
            for (int j = i + 1; j < arrDaySo.length; j++){  
                if (arrDaySo[j] < arrDaySo[index]){  
                    index = j;//searching for lowest index  
                }  
            }  
            int smallerNumber = arrDaySo[index];   
            arrDaySo[index] = arrDaySo[i];  
            arrDaySo[i] = smallerNumber;  
        }  
	}
}
