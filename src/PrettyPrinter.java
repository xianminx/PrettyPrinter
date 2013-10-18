import java.lang.reflect.Field;

public class PrettyPrinter {
	public static String toString(Object obj) {
		if (obj == null)
			return "null";

		Class<?> clz;
		if (obj instanceof Class) {
			clz = (Class<?>) obj;
		} else {
			clz = obj.getClass();
		}
		StringBuilder sb = new StringBuilder(clz.getName());
		sb.append("[");
		Field[] fields = clz.getDeclaredFields();
		for (Field field : fields) {
			try {
				String name = field.getName();
				Object value = field.get(obj);
				if (value == null)
					value = "null";
				sb.append(name + "=" + value + ",");
			} catch (IllegalArgumentException e) {
				// e.printStackTrace();
			} catch (IllegalAccessException e) {
				// e.printStackTrace();
			}
		}
		if (sb.charAt(sb.length() - 1) == ',')
			sb.deleteCharAt(sb.length() - 1);
		sb.append("]");
		return sb.toString();
	}

}
