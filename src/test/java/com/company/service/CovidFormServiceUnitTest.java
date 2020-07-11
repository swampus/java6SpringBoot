package com.company.service;

import com.company.model.CorvidForm;
import com.company.repository.CorvidFormRepository;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;

class CovidFormServiceUnitTest {

    private CorvidFormRepository corvidFormRepository
            = mock(CorvidFormRepository.class);

    private CovidFormService covidFormService
            = new CovidFormService(corvidFormRepository);

    @Test
    void saveCorvidForm() {
        covidFormService.saveCorvidForm(new CorvidForm());
    }

    @Test
    void checkCorvidFormExists() {
    }
}