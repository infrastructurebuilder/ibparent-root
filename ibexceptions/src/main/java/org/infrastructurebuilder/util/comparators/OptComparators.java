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
import java.util.Objects;
import java.util.Optional;

public class OptComparators<T> {

  public interface OptionalComparator<T> extends Comparator<Optional<T>> {
    Comparator<T> getComparator();
  }

  private abstract static class AbstractOptionalComparator<T> implements OptionalComparator<T> {
    private Comparator<T> tcmp;

    public AbstractOptionalComparator(Comparator<T> tcmp) {
      this.tcmp = Objects.requireNonNull(tcmp);
    }

    public final Comparator<T> getComparator() {
      return tcmp;
    }

    public final int compare(Optional<T> obj1, Optional<T> obj2) {
      if (obj1.isPresent() && obj2.isPresent())
        return getComparator().compare(obj1.get(), obj2.get());
      return theRest(obj1, obj2);
    }

    protected abstract int theRest(Optional<T> obj1, Optional<T> obj2);

  }

  public final static class AbsentFirst<T> extends AbstractOptionalComparator<T> {
    public AbsentFirst(Comparator<T> tcmp) {
      super(tcmp);
    }

    @Override
    protected int theRest(Optional<T> obj1, Optional<T> obj2) {
      if (obj1.isPresent()) {
        return -1;
      } else if (obj2.isPresent()) {
        return 1;
      }
      return 0;
    }
  }

  public final static class AbsentLast<T> extends AbstractOptionalComparator<T> {
    public AbsentLast(Comparator<T> tcmp) {
      super(tcmp);
    }

    @Override
    public int theRest(Optional<T> obj1, Optional<T> obj2) {
      if (obj1.isPresent()) {
        return 1;
      } else if (obj2.isPresent()) {
        return -1;
      } else {
        return 0;
      }
    }

  }

  public final static <T> OptionalComparator<T> absentFirstComparator(Comparator<T> tcmp) {
    return new AbsentFirst(tcmp);
  }

  public final static <T> OptionalComparator<T> absentLastComparator(Comparator<T> tcmp) {
    return new AbsentLast(tcmp);
  }

}