package com.tlw.spring.practice.ch03_adv.e01_aware_bean;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ResourceLoaderAware;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Service;

import java.io.IOException;

/**
 * Created by 唐力伟 on 2017/4/9 10:49.
 */
@Service
public class AwareService implements BeanNameAware, ResourceLoaderAware{

    private String beanName;
    private ResourceLoader loader;

    public void setBeanName(String name) {
        this.beanName = name;
    }

    public void setResourceLoader(ResourceLoader resourceLoader) {
        this.loader = resourceLoader;
    }

    public void outputResult(){
        System.out.println("Bean name: " + beanName);
        Resource resource = loader.getResource("classpath:com/tlw/spring/practice/ch03_adv/e01_aware_bean/test.txt");
        try{
            System.out.println("ResourceLoader load: " + IOUtils.toString(resource.getInputStream()));
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
