package ru.itis.service;

import org.springframework.stereotype.Service;
import ru.itis.dto.CmsPageDto;
import ru.itis.entity.CmsPage;
import ru.itis.form.CmsPageForm;
import ru.itis.repository.CmsRepository;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class CmsServiceImpl implements CmsService {

    private final CmsRepository repository;

    public CmsServiceImpl(CmsRepository repository) {
        this.repository = repository;
    }

    @Override
    public void save(CmsPageForm pageForm) {
        repository.save(convertFromFormToEntity(pageForm));
    }

    @Override
    public List<CmsPageDto> getAll() {
        return repository.findAll().stream()
                .map(this::convertFromEntityToDto).collect(Collectors.toList());
    }

    @Override
    public Optional<CmsPageDto> getById(Long id) {
        return repository.findById(id).map(this::convertFromEntityToDto);
    }

    private CmsPage convertFromFormToEntity(CmsPageForm form) {
        return CmsPage.builder().name(form.getName()).content(form.getContent()).build();
    }

    private CmsPageDto convertFromEntityToDto(CmsPage page) {
        return CmsPageDto.builder().id(page.getId()).name(page.getName()).content(page.getContent()).build();
    }
}
