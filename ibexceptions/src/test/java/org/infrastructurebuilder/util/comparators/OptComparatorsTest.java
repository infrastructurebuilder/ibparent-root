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

import static org.junit.jupiter.api.Assertions.*;

import java.util.Comparator;
import java.util.Optional;

import org.infrastructurebuilder.util.comparators.OptComparators.OptionalComparator;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class OptComparatorsTest {

  Optional<String> a = Optional.of("A"), b = Optional.of("B");
  Optional<String> empty = Optional.empty();

  Comparator<String> comp = BasicTComparator.STRING_COMPARATOR;
  private OptionalComparator<String> af;
  private OptionalComparator<String> al;

  @BeforeAll
  static void setUpBeforeClass() throws Exception {
  }

  @BeforeEach
  void setUp() throws Exception {
    af = OptComparators.absentFirstComparator(comp);
    al = OptComparators.absentLastComparator(comp);
  }

  @Test
  void testAbsentFirstComparator() {
    assertEquals(0, af.compare(a, a));
    assertTrue(af.compare(a, b) < 0);
    assertTrue(af.compare(b, a) > 0);
    assertTrue(af.compare(empty, empty) == 0);
    assertTrue(af.compare(a, empty) < 0);
    assertTrue(af.compare(empty, a) > 0);
  }

  @Test
  void testAbsentLastComparator() {
    assertEquals(0, al.compare(a, a));
    assertTrue(al.compare(a, b) < 0);
    assertTrue(al.compare(b, a) > 0);
    assertTrue(al.compare(empty, empty) == 0);
    assertTrue(al.compare(a, empty) > 0);
    assertTrue(al.compare(empty, a) < 0);
  }

}
