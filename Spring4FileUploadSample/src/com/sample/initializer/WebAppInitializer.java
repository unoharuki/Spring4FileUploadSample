package com.sample.initializer;

import javax.servlet.MultipartConfigElement;
import javax.servlet.ServletRegistration;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import com.sample.configuration.WebConfiguration;
/**
 * 이 초기자화일은 MultiPartConfigElement의 프로그람적인 등록을 실현하였다.
 * @author Administrator
 *
 */
public class WebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		//웨브구성클라스들을 뿌리구성클라스묶음에 넣는다.
		return new Class[] {WebConfiguration.class };
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		return null;
	}

	@Override
	protected String[] getServletMappings() {
		return new String[] { "/" };
	}
/*
 * 요구되는 MultiPartConfigElement를 DispatcherServlet에 등록하기 위하여 이 메소드를 정의한다.
 * @see org.springframework.web.servlet.support.AbstractDispatcherServletInitializer#customizeRegistration(javax.servlet.ServletRegistration.Dynamic)
 */
	@Override
	protected void customizeRegistration(ServletRegistration.Dynamic registration) {
		//써블레트등록기에 multipart구성정보를 설정해준다.
		registration.setMultipartConfig(getMultipartConfigElement());
	}

	/*
	 * 여기서 우의 등록시 화일이 올리적재조작기간 디스크에 림시적으로 저장될 최대화일크기와 요청크기, 위치, 스레스홀드와 같은 구체적인 속성들
	 * 을 설정하기 위한 기회를 제공해준다.
	 */
	private MultipartConfigElement getMultipartConfigElement() {
		MultipartConfigElement multipartConfigElement = new MultipartConfigElement(LOCATION, MAX_FILE_SIZE,
				MAX_REQUEST_SIZE, FILE_SIZE_THRESHOLD);
		return multipartConfigElement;
	}

	// 화일이 저장될 림시저장위치
	private static final String LOCATION = "C:/temp/"; 

	//최대화일크기.Max file size.그 크기이상은 스프링이 례외를 던진다.
	private static final long MAX_FILE_SIZE = 5242880; // 5MB : 
	
	 // Multipart에 포함하는 총 요청크기
	private static final long MAX_REQUEST_SIZE = 20971520; // 20MB :

	//화일들이 디스크에 써진후의 스레스홀드크기
	private static final int FILE_SIZE_THRESHOLD = 0; 

}
