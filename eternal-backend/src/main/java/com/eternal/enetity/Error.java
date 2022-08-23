package com.eternal.enetity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

/**
 * @author xiao
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Error {

    private LocalDateTime localDateTime;

    private String message;
}
