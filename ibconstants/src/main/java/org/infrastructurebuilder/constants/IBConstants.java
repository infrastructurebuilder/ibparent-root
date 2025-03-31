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
package org.infrastructurebuilder.constants;

import java.nio.charset.Charset;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Optional;
import java.util.function.Supplier;

public interface IBConstants {

  String UTF_8 = "UTF-8";
  String DEFAULT = "default";
  String IBDATA_PREFIX = "IBDataTemp_";
  String IBDATA_SUFFIX = ".ibdata";

  String IBR_MANIFEST = "application/vnd.ibr.manifest.xml";
  String APPLICATION_ACCESS = "application/msaccess";
  String APPLICATION_LIQUIBASE_CHANGELOG = "application/liquibase-changelog+xml";
  String APPLICATION_MSWORD = "application/msword";
  String APPLICATION_MSWORDX = "application/vnd.openxmlformats-officedocument.wordprocessingml.document";
  String APPLICATION_OCTET_STREAM = "application/octet-stream";
  String APPLICATION_JAR = "application/java-archive";
  String APPLICATION_IBDATA = "application/ibdata-archive";
  String APPLICATION_X_MAC = "application/x-mach-o";
  String APPLICATION_PDF = "application/pdf";
  String APPLICATION_PPTX = "application/vnd.ms-powerpoint";
  String APPLICATION_VND_OASIS_SPREADSHEET = "application/vnd.oasis.opendocument.spreadsheet";
  String APPLICATION_XLS = "application/msexcel";
  String APPLICATION_XLSX = "application//vnd.openxmlformats-officedocument.spreadsheetml.sheet";
  String APPLICATION_XML = "application/xml";
  String APPLICATION_X_TIKA_MSOFFICE = "application/x-tika-msoffice";
  String APPLICATION_ZIP = "application/zip";
  String AVRO_BINARY = "avro/binary";
  String AVRO_SCHEMA = "application/avro+json"; // AVSC
  String DBUNIT_DTD = "application/dbunit-DTD";
  String DBUNIT_FLATXML = "application/dbunit-export+xml";
  String IBDATA_SCHEMA = "application/vnd.ibdata-schema+xml";
  String IMAGE_JPG = "image/jpeg";
  String JSON_TYPE = "application/json";
  String JSON_TYPE_SEQ = JSON_TYPE + "-seq"; // See https://tools.ietf.org/html/rfc7464
  // This is a specific type that keeps cropping up
  String NLD_JSON_TYPE = JSON_TYPE + ";newline-delimited-records"; // ALMOST a json-seq :)
  String PROTOBUF0 = "application/vnd.google.protobuf";
  String PROTOBUF1 = "application/x-protobuf";
  String PROTOBUF2 = "application/x-google-protobuf";
  // IBData's preferred content type for protobug is PROTOBUF3
  String PROTOBUF3 = "application/protobuf";
  String TEXT_CSV = "text/csv";
  String HEADER = ";header";
  String TEXT_CSV_WITH_HEADER = TEXT_CSV + HEADER;
  String TEXT_HTML = "text/html";
  String TEXT_PLAIN = "text/plain";
  String TEXT_PSV = "text/pipe-separated-values";
  String TEXT_PSV_WITH_HEADER = TEXT_PSV + HEADER;
  String TEXT_TSV = "text/tab-separated-values";
  String TEXT_TSV_WITH_HEADER = TEXT_TSV + HEADER;
  String VIDEO_AVI_1 = "video/avi";
//   String LIQUIBASE_SCHEMA = "application/liquibase-schema+xml";

  String JAVA_LANG_STRING = "java.lang.String";
  String JSONSTRUCT = "org.json.JSONObject";
  String ORG_W3C_DOM_NODE = "org.w3c.dom.Node";
  String ORG_APACHE_AVRO_GENERIC_INDEXED_RECORD = "org.apache.avro.generic.IndexedRecord";

  String AVI = "avi";
  String AVRO = "avro";
  String AVSC = "avsc";
  String BIN = "bin";
  String CBOR = "cbor";
  String PDF = "pdf";
  String PSV = "psv";
  String DOCX = "docx";
  String DOC = "doc";
  String MDB = "mdb";
  String XLSX = "xlsx";
  String XLS = "xls";
  String TSV = "tsv";
  String CSV = "csv";
  String ZIP = "zip";
  String TXT = "txt";
  String HTML = "html";
  String HTM = "htm";
  String XML = "xml";
  String IBDATAARCHIVE = "ibdata";
  String JARARCHIVE = "jar";
  String ODS = "ods";
  String PPT = "ppt";
  String PROTO = "proto";
  String THRIFT = "thrift";
  String DTD = "dtd";
  String JSON_EXT = "json";
  String JPG = "jpg";
  String JPEG = "jpeg";
  String NLD_JSON_EXT = "nldjson";

  String _SHA512 = "sha512";
  String _SHA256 = "sha256";
  String ASC_EXT = "asc";
  String DEFAULT_EXTENSION = BIN;

  List<String> CHECKSUM_TYPES_DEFAULT = Arrays.asList(_SHA256);

  Optional<String> CHECKSUM_TYPES_SHA512 = Optional.of(_SHA512);
  Optional<String> CHECKSUM_TYPES_SHA256 = Optional.of(_SHA256);

  DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("yyyyMMdd-HHmmss-SSS").withLocale(Locale.US)
      .withZone(ZoneId.of("Z"));

  String DIGEST_TYPE = "SHA-256";
  String DIRECTORY_PERMISSIONS = "directoryPermissions";
  String EXPORTED = "ExportedInsecureTestKeyrings";
  String FACTORY_NAME = "org.infrastructurebuilder.core.config.CoreCryptoProviderFactory";
  String FILE_PERMISSIONS = "filePermissions";
  String FILESYSTEM_CRYPTO_CONFIGURATION = "Filesystem-Crypto-Configuration";
  String GITHUB = "github";
  String AZUREDEVOPS = "azuredevops";
  String HEX_IDENTIFIER = "HEXID:";
  String HOME_ENV = "user.home";
  Supplier<String> HOMESUPPLIER = () -> System.getenv("HOME");
  String ID = "id";
  String KEYSERVER_DEFAULT_HOST = "pgp.mit.edu";
  String KEYSERVER_HOST_ENV = "SPECIFIC_KEYSERVER_HOST";
  String MAVEN = "maven";
  String MAVEN_MIRRORS = "MAVEN_MIRRORS";
  String MAVEN_REPO_LOCAL = "maven.repo.local";
  Path M2REPOSITORYPATH = Paths.get(".m2").resolve("repository");
  String NAME = "name";
  String NO_OP = "no-op";
  String NULL_PASSPHRASE = "*NULL*";
  String OF = "of";
  String PASSPHRASE = "passphrase";
  String PASSPHRASE_ENV = "SPECIFIC_PASSPHRASE";
  String PASSWORD = "password";
  String PASSWORD_TYPE = "PASSWORD";
  String PRIVATE_KEY = "privateKey";
  String RANDOM = "*RANDOM*";

  String ROOTPATH = "org/infrastructurebuilder/test/keys";
  String SHA512 = _SHA512;
  String SHA256 = _SHA256;
  String SOURCE_LEVEL = "sourceLevel";
  String SYMMETRIC_PREFIX = "*#*";
  String TXT_EXT = ".txt";
  String UNENCRYPTED = "_unencrypted_";
  String URL = "url";
  String USERNAME = "username";

  Charset UTF8 = Charset.forName(UTF_8);
  String VERSION = "version";

  String HTTP_PREFIX = "http://";
  String HTTPS_PREFIX = "https://";
  String FILE_PREFIX = "file:";
  String ZIP_PREFIX = "zip:";
  String JAR_PREFIX = "jar:";

  String TARGET_DIR_PROPERTY = "target_dir";
  String MAVEN_TARGET_PATH = "./target";
  String TEMPORARYID = "temporaryId";
  String DESCRIPTION = "description";
  String ADDITIONAL_PROPERTIES = "additionalProperties";
  String CREDENTIALS = "credentials";

  String DTD_RESOURCE = "dbUnitDTD";
  String FAIL_ON_ERROR = "failOnError";

  // For ThrowableJSONObject
  String MESSAGE = "message";
  String CLASS = "class";
  String CAUSE = "cause";
  String STACK_TRACE = "stackTrace";
  String UNKNOWN_THROWABLE_CLASS = "unknown.throwable.class";

  String PATH_CHECKSUM = "pathChecksum";
  String CREATE_DATE = "created";
  String UPDATE_DATE = "updated";
  String EXPIRE_DATE = "expires";
  String INSTANT = "instant";
  String MOST_RECENT_READ_TIME = "mostRecentRead";
  String PATH = "path";
  String SIZE = "size";
  String SOURCE_NAME = "sourceName";
  String SOURCE_URL = "sourceURL";
  String MIME_TYPE = "mimeType";
  String ORIGINAL_PATH = "originalPath";
  String METADATA_DIR_NAME = "METADATA";
  String BLOBSTORE_ROOT = "blobstoreRoot";
  String BLOBSTORE_MAXBYTES = "blobstoreMaxBytes";
  Long BLOBSTORE_NO_MAXBYTES = -1L;
  long UNKNOWN_SIZE = -1L;

  String NO_PATH_SUPPLIED = "no.path.supplied";
  String METADATA = "metadata";
  String NOT_FOUND = "not.found";
  String UNAVAILABLE_PATH = "unavailable.path";
  String WORKINGDIR = "working.dir";
  String CACHEDIR = "download.cache.dir";
  String FILEMAPPERS = "file.mappers";
  String UNIMPLEMENTED = "UNIMPLEMENTED";

  String TIMESTAMP_FORMATTER = "timestamp.formatter";
  String TIME_FORMATTER = "time.formatter";
  String DATE_FORMATTER = "date.formatter";

}
