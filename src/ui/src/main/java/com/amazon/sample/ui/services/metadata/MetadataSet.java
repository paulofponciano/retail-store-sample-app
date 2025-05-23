/*
 * Copyright Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * SPDX-License-Identifier: MIT-0
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this
 * software and associated documentation files (the "Software"), to deal in the Software
 * without restriction, including without limitation the rights to use, copy, modify,
 * merge, publish, distribute, sublicense, and/or sell copies of the Software, and to
 * permit persons to whom the Software is furnished to do so.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED,
 * INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A
 * PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT
 * HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION
 * OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE
 * SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

package com.amazon.sample.ui.services.metadata;

import java.util.ArrayList;
import java.util.List;
import lombok.Data;

@Data
public class MetadataSet {

  private String name;

  private List<MetadataAttribute> attributes;

  public MetadataSet(String name) {
    this.name = name;

    this.attributes = new ArrayList<>();
  }

  public MetadataSet(String name, List<MetadataAttribute> attributes) {
    this.name = name;

    this.attributes = attributes;
  }

  public MetadataSet add(MetadataAttribute attribute) {
    this.attributes.add(attribute);

    return this;
  }

  public String getName() {
    return this.name;
  }

  public List<MetadataAttribute> getAttributes() {
    return this.attributes;
  }

  public MetadataAttribute getAttribute(String name) {
    return this.attributes.stream()
      .filter(a -> a.getName().equals(name))
      .findFirst()
      .orElse(null);
  }
}
