package br.ufms.student_system.configuration;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ModelMapperConfig {

    private ModelMapper modelMapper;

    @Bean
    public ModelMapper mapper(){
        return new ModelMapper();
    }
}
