package coffeshop_backend.coffeshop_project_backend.utils;

import java.util.Locale;

import org.springframework.context.NoSuchMessageException;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.stereotype.Component;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class CarMessageSourceAccessor {

	private CarMessageSource carMessageSource;

	public String getMessage(String code, Object... objects) {
		try {
			// Try to get the message with the requested locale
			return this.carMessageSource.getMessage(code, objects, code, LocaleContextHolder.getLocale());
		} catch (NoSuchMessageException e) {
			try {
				// If not found, get the message with the locale (EN)
				return this.carMessageSource.getMessage(code, objects, code, Locale.ENGLISH);
			} catch (NoSuchMessageException e1) {
				// If still not found, return the key
				return code;
			}
		}
	}

	public String getMessage(String code, Locale locale, Object... objects) {
		try {
			// Try to get the message with the requested locale
			return this.carMessageSource.getMessage(code, objects, code, locale);
		} catch (NoSuchMessageException e) {
			try {
				// If not found, get the message with the locale (EN)
				return this.carMessageSource.getMessage(code, objects, code, Locale.ENGLISH);
			} catch (NoSuchMessageException e1) {
				// If still not found, return the key
				return code;
			}
		}
	}

}
