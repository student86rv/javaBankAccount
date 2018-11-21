
public class BankAccount {

    private String name;
    private double count;

    public BankAccount(String name, double count) {
        this.name = name;
        this.count = count;
    }

	// 0.5%
    public void add(double money) {
		this.count += 0.995 * money;
	}
		
    // 1%
    public void transfer(BankAccount otherPerson, double money){
		double tmp = otherPerson.getCount();
		tmp += 0.99 * money;
		otherPerson.setCount(tmp);
		this.count -= money;
	}
	
	public double getCount() {
		return count;
	}
	
	public String getName() {
		return name;
	}
	
	public void setCount(double count) {
		this.count = count;
	}
	
	@Override
    public String toString() {
        return "BankAccount{" +
                "name= " + name +
                ", count= " + count +
                '}';
    }
}