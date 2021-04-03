package ar.com.pa.model;

import java.util.Comparator;

import org.springframework.data.mongodb.core.mapping.Field;
import lombok.Data;

@Data
public class Property{


		@Field(name = "code")
		public String code;
		
		@Field(name = "title")
		public String title;
		
		public Property(String code, String title) {
		this.code = code;
		this.title = title;
	}
		
		public static Comparator<Property> byTitle = Comparator.comparing(Property::getTitle);

		
}
