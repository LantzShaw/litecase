//package com.litecase.base.config;
//
//import org.springframework.cache.annotation.EnableCaching;
//import org.springframework.cache.ehcache.EhCacheCacheManager;
//import org.springframework.cache.ehcache.EhCacheManagerFactoryBean;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.core.io.ClassPathResource;
//
//@EnableCaching
//@Configuration
//public class CatchConfig {
//    @Bean
//    public EhCacheCacheManager cacheManager() {
//        EhCacheCacheManager cacheManager = new EhCacheCacheManager();
//        cacheManager.setCacheManager(ehCacheManagerFactoryBean().getObject());
//        return cacheManager;
//    }
//
//    @Bean
//    public EhCacheManagerFactoryBean ehCacheManagerFactoryBean() {
//        EhCacheManagerFactoryBean ehCacheManagerFactoryBean = new EhCacheManagerFactoryBean();
//        ehCacheManagerFactoryBean.setConfigLocation(new ClassPathResource("ehcache.xml"));
//        ehCacheManagerFactoryBean.setShared(true);
//        return ehCacheManagerFactoryBean;
//    }
//}
