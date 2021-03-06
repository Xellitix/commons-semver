package com.xellitix.commons.semver.metadata;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.junit.Test;

/**
 * {@link MetadataModule} test case.
 *
 * @author Grayson Kuhns
 */
public class MetadataModuleTest {

  // Fixtures
  private final Injector injector = Guice.createInjector(new MetadataModule());

  @Test
  public void provision__IdentifierFactory__Test() {
    injector.getInstance(IdentifierFactory.class);
  }

  @Test
  public void provision__MetadataFactory__Test() {
    injector.getInstance(MetadataFactory.class);
  }

  @Test
  public void provision__BuildMetadataIdentifierValidator__Test() {
    injector.getInstance(BuildMetadataIdentifierValidator.class);
  }

  @Test
  public void provision__PreReleaseMetadataIdentifierValidator__Test() {
    injector.getInstance(PreReleaseMetadataIdentifierValidator.class);
  }

  @Test
  public void provision__BuildMetadataValidator__Test() {
    injector.getInstance(BuildMetadataValidator.class);
  }

  @Test
  public void provision__PreReleaseMetadataValidator__Test() {
    injector.getInstance(PreReleaseMetadataValidator.class);
  }

  @Test
  public void provision__MetadataParser__Test() {
    injector.getInstance(MetadataParser.class);
  }
}
