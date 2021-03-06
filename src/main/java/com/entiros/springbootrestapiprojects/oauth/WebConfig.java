package com.entiros.springbootrestapiprojects.oauth;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.http.converter.ByteArrayHttpMessageConverter;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class WebConfig extends WebMvcConfigurerAdapter{
	
	
	@Override
	public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
		// TODO Auto-generated method stub
		 final ByteArrayHttpMessageConverter arrayHttpMessageConverter = new ByteArrayHttpMessageConverter();
		    final List<MediaType> list = new ArrayList<>();
		    list.add(MediaType.IMAGE_JPEG);
		    list.add(MediaType.APPLICATION_OCTET_STREAM);
		    arrayHttpMessageConverter.setSupportedMediaTypes(list);
		    converters.add(arrayHttpMessageConverter);

		    super.configureMessageConverters(converters);
	}

}
