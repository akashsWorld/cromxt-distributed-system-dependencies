package com.cromxt.common.crombucket.routeing;


import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@ToString
public class BucketDetails{
        String bucketId;
        String hostName;
        Integer httpPort;
        Integer rpcPort;
}
