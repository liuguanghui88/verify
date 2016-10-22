/**
 * 
 */
package org.fan.validator.handle.impl;

import java.lang.reflect.Field;
import java.util.Map;

import org.fan.validator.annotation.ValidatorAnnotation;
import org.fan.validator.exception.impl.NotImplementedException;
import org.fan.validator.handle.ValidatorHandle;

/**
 * 注解默认的handle
 * @author XiaoFan
 *
 */
public class DefaultValidatorHandle implements ValidatorHandle {

    @Override
    public void handle(ValidatorAnnotation annotation, Field field, Map<String, String> error) {
        throw new NotImplementedException();
    }

}
