package com.shop.ecommerce.config;

import com.shop.ecommerce.entity.Product;
import com.shop.ecommerce.entity.ProductCategory;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;
import org.springframework.http.HttpMethod;
import org.springframework.web.servlet.config.annotation.CorsRegistry;


@Configuration
public class RestConfiguration implements RepositoryRestConfigurer {

    @Override
    public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config, CorsRegistry cors) {
        HttpMethod[] unSupportedAction = {HttpMethod.POST, HttpMethod.PUT,HttpMethod.DELETE};

        config.getExposureConfiguration().forDomainType(Product.class).withItemExposure((metadata,httpMethods)-> httpMethods.disable(unSupportedAction)).withCollectionExposure(((metdata, httpMethods) -> httpMethods.disable(unSupportedAction)));

        config.getExposureConfiguration().forDomainType(ProductCategory.class).withItemExposure(((metdata, httpMethods) -> httpMethods.disable(unSupportedAction))).withCollectionExposure(((metdata, httpMethods) -> httpMethods.disable(unSupportedAction)));

        RepositoryRestConfigurer.super.configureRepositoryRestConfiguration(config, cors);
    }
}