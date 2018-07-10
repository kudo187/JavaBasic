package AssignmentInterface;

public class InsertSort extends DaySo implements Sort {

	InsertSort(int n) {
		super(n);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void Sort() {
		// TODO Auto-generated method stub
		int i, j, newValue;
		for (i = 1; i < arrDaySo.length; i++) {
			newValue = arrDaySo[i];
			j = i;
			while (j > 0 && arrDaySo[j - 1] > newValue) {
				arrDaySo[j] = arrDaySo[j - 1];
				j--;
			}
			arrDaySo[j] = newValue;
		}
	}
}
