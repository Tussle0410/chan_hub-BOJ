import { useRouter } from "next/router";
import { useEffect } from "react";
import { Inter } from "next/font/google";
import { Problem, SolvedProps } from "../components/interfaces/server_types";
import styles from "@/styles/Home.module.css";
import CodeEditor from "../components/elements/code_editor";
import Head from "next/head";
import Image from "next/image";
import Text from "../components/elements/text";
import Tag from "../components/elements/tag";
import ErrorDiv from "../components/elements/error_div";
import Footer from "../components/elements/footer";
import Link from "next/link";
import SearchBar from "../components/elements/search_bar";

export { getServerSideProps } from "../components/fetchs/solved_fetch";

const inter = Inter({ subsets: ["latin"] });

const ProblemPage = (getServerSideProps: SolvedProps) => {
  const router = useRouter();
  const { problemId } = router.query;
  const problem: Problem = getServerSideProps.problem;
  const errorCode = getServerSideProps.errorCode;

  useEffect(() => {
    if (!problemId) {
      router.push("/");
    }
  }, [problemId, router]);

  if (!problemId) {
    return <p>Redirecting...</p>;
  }
  if (getServerSideProps == null) {
    return <p>Redirecting...</p>;
  }
  if (errorCode == false) {
    return (
      <>
        <Head>
          <title>ChanHub BOJ - 백준 JAVA 풀이 코드 모음</title>
          <meta name="description" content="ChanHub BOJ" />
          <meta name="viewport" content="width=device-width, initial-scale=1" />
          <link rel="icon" href="/favicon.ico" />
        </Head>
        <main className={`${styles.main} ${inter.className}`}>
          <div className={styles.menu}>
            <Link href="/">
              <Image
                className={styles.home_icon}
                src="/home.png"
                alt="hoem.icon"
                width={25}
                height={25}
                priority
              />
            </Link>
          </div>
          <Text text="문제 검색"></Text>
          <SearchBar></SearchBar>
          <div className={styles.center}>
            <div className={styles.solution}>
              <Text text={"문제 : " + problem.problemId + "번 " + problem.title}></Text>
              <div className={styles.link_haed_a}>
                <a href={"https://www.acmicpc.net/problem/" + problem.problemId} target="_blank">
                  문제 바로가기
                </a>
              </div>
              <CodeEditor problem={problem}></CodeEditor>
              {problem.blogUrl != "" && (
                <div className={styles.link_tail_a}>
                  <a href={problem.blogUrl} target="_blank">
                    풀이 해석
                  </a>
                </div>
              )}
              <Text text="분류"></Text>
              <Tag tags={problem.tags}></Tag>
            </div>
          </div>
        </main>
        <Footer></Footer>
      </>
    );
  } else {
    if (errorCode == 404) {
      return (
        <>
          <Head>
            <title>ChanHub BOJ - 백준 JAVA 풀이 코드 모음</title>
            <meta name="description" content="ChanHub BOJ" />
            <meta name="viewport" content="width=device-width, initial-scale=1" />
            <link rel="icon" href="/favicon.ico" />
          </Head>
          <main className={`${styles.main} ${inter.className}`}>
            <div className={styles.menu}>
              <Link href="/">
                <Image
                  className={styles.home_icon}
                  src="/home.png"
                  alt="hoem.icon"
                  width={25}
                  height={25}
                  priority
                />
              </Link>
            </div>
            <Text text="문제 검색"></Text>
            <SearchBar></SearchBar>
            <div className={styles.center}>
              <ErrorDiv message="해당 문제 풀이가 등록되어 있지 않습니다."></ErrorDiv>
            </div>
          </main>
          <Footer></Footer>
        </>
      );
    } else {
      return (
        <>
          <Head>
            <title>ChanHub BOJ - 백준 JAVA 풀이 코드 모음</title>
            <meta name="description" content="ChanHub BOJ" />
            <meta name="viewport" content="width=device-width, initial-scale=1" />
            <link rel="icon" href="/favicon.ico" />
          </Head>
          <main className={`${styles.main} ${inter.className}`}>
            <div className={styles.menu}>
              <Link href="/">
                <Image
                  className={styles.home_icon}
                  src="/home.png"
                  alt="hoem.icon"
                  width={25}
                  height={25}
                  priority
                />
              </Link>
            </div>
            <Text text="문제 검색"></Text>
            <SearchBar></SearchBar>
            <div className={styles.center}>
              <ErrorDiv message="서버가 응답하지 않습니다. 잠시후에 시도해주세요."></ErrorDiv>
            </div>
          </main>
          <Footer></Footer>
        </>
      );
    }
  }
};

export default ProblemPage;
