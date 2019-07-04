package {{base_package}}.{{package_path}}.support;

import org.springframework.stereotype.Service;

import javax.inject.Inject;

/**
 * @author {{author}}
 * @since 1.0
 */
@Service
public class {{domain}}ServiceImpl implements {{domain}}Service {

    @Inject
    {{domain}}Repository {{domain_lower}}Repository;
}