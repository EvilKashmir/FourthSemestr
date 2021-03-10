package ru.itis.service;

import ru.itis.dto.CmsPageDto;
import ru.itis.form.CmsPageForm;

import java.util.List;
import java.util.Optional;

public interface CmsService {

    void save(CmsPageForm pageForm);

    List<CmsPageDto> getAll();

    Optional<CmsPageDto> getById(Long id);
}
