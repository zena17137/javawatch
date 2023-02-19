import javafx.scene.input.DataFormat;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Main {
	public static void main(String[] args) throws Exception {
		Date date = new Date();
		System.out.println(date);
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		calendar.add(Calendar.MINUTE, 1);
		System.out.println(calendar.getTime());
		DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.SHORT);
		System.out.println(dateFormat.format(calendar.getTime()));
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm");
		System.out.println(simpleDateFormat.format(calendar.getTime()));
		Date newDate = simpleDateFormat.parse("05/12/1985 05:22");
		System.out.println(newDate);
	}
}