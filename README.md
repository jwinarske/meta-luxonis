# meta-luxonis
Luxonis Layer for Yocto

## Getting Started

To layer features to you OS image, add the following to your conf/local.conf file:

```
IMAGE_INSTALL:append = " \
    depthai-core-examples \
    depthai-core-tests \
    movidius-udev-rule \
    "
```

Default config includes FWP files as resource in shared library.  This is done to prevent redundancy.

Known issues:

https://github.com/jwinarske/meta-luxonis/issues/3

## Example Status

No apparent issues
## Tests Status

Raspberry PI 4

* All tests pass with exception of stability_stress_test



## Yocto Recipes

### depthai-core

### backward

### fp16-luxonis

### libarchive-luxonis

### libnop-luxonis

### movidius-udev-rule

Installs udev rule to enable user mode access to movidius USB device

### psimd

### spdlog

### xlink-luxonis
