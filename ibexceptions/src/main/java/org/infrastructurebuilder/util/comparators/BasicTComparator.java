/*
 * @formatter:off
 * Copyright © 2019 admin (admin@infrastructurebuilder.org)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * @formatter:on
 */
package org.infrastructurebuilder.util.comparators;

import java.util.Comparator;

public class BasicTComparator<T extends Comparable<T>> implements Comparator<T> {
  public static final Comparator<String> STRING_COMPARATOR = new BasicTComparator<String>();;

  @Override
  public int compare(T o1, T o2) {
    return o1.compareTo(o2);
  }
}
