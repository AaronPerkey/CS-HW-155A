package unl.cse;

import java.util.ArrayList;
import java.util.List;

/**
 * A <code>Section</code> is a class that holds a certain number of students,
 * but all the students in one section must be the same type.
 *
 */
public class Section <T> {

	private final String sectionNumber;
	private final List<T> sectionRoster;

	public Section(String sectionNumber) {
		this.sectionNumber = sectionNumber;
		this.sectionRoster = new ArrayList<T>();
	}

	public void enroll(T t) {
		this.sectionRoster.add(t);
	}

	public String getSectionNumber() {
		return sectionNumber;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(String.format("SECTION %s\n", this.getSectionNumber()));
		sb.append("---------------------------------------------\n");
		for (Object o : this.sectionRoster) {
			sb.append(String.format(" %s\n", o));
		}
		return sb.toString();
	}
}